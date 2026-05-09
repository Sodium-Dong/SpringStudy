# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Project Overview

Sky Take Out (苍穹外卖) - A food delivery backend system built with Spring Boot 2.7.3.

## Build Commands

```bash
# Build all modules
mvn clean install

# Build and run the server
mvn spring-boot:run -pl sky-server

# Run tests
mvn test -pl sky-server

# Package for deployment
mvn clean package -pl sky-server
```

## Architecture

### Module Structure
- **sky-common**: Shared utilities, exceptions, constants, result wrappers, and properties
- **sky-pojo**: DTOs, entities, and view objects
- **sky-server**: Main application with controllers, services, mappers

### Tech Stack
- Spring Boot 2.7.3, MyBatis, Druid connection pool
- MySQL database, Redis for caching
- JWT authentication, Knife4j for API documentation
- PageHelper for pagination, Lombok

### Layer Architecture
```
Controller (sky-server/controller)
    ↓
Service Interface (sky-server/service)
    ↓
Service Implementation (sky-server/service/impl)
    ↓
Mapper (sky-server/mapper) - MyBatis with annotations + XML
```

### Key Patterns

**Uniform Response Format**: All controllers return `Result<T>` with code (1=success, 0=failure), msg, and data.

**JWT Authentication**: `JwtTokenAdminInterceptor` validates tokens for `/admin/**` paths (except login). Extracts employee ID to `BaseContext` ThreadLocal.

**Global Exception Handling**: `GlobalExceptionHandler` catches exceptions and returns formatted error responses.

**MyBatis**: Uses both annotations (`@Select`, `@Insert`) for simple queries and XML mappers (`mapper/*.xml`) for dynamic SQL.

**PageHelper**: Pagination via `PageHelper.startPage(page, pageSize)` before query execution.

### Configuration
- Main application: `sky-server/src/main/resources/application.yml`
- Environment-specific: `application-dev.yml` (database credentials)
- Default port: 8080

### Database
- MySQL database: `sky_take_out`
- Entities: Employee, Dish, Setmeal, Category, Orders, User, ShoppingCart, AddressBook

## 输出规范
- 所有对话都以中文输出
- 生成代码时，尽量不修改原有代码
- 生成的代码写明清晰的注释