# Copilot Instructions for GoogleCards-Java

## Project Overview
This is a Java library that simplifies the creation and manipulation of interactive cards using the Google Chat Cards API. It abstracts the complexity of the REST API and provides intuitive methods for seamless integration.

## Project Structure
- **Package Structure**: `dev.lilcode.googlecard`
  - `v1.types` - Deprecated v1 API types
  - `v2.types` - Current v2 API types
  - `types` - Common types (TextMessage)
  - `interfaces.annotations` - Custom annotations for validation and marking API-specific features
  - `interfaces.clients` - Client interfaces (GoogleChatWebhook)
  - `controllers` - Implementation classes (ClientGoogleChatWebhook)
  - `exception` - Custom exceptions
  - `validations` - Validation logic

## Coding Standards

### Language & Version
- **Java Version**: Java 23
- Use modern Java features including Records, Pattern Matching, and Switch Expressions

### Code Style
- **Lombok**: Use Lombok annotations extensively
  - `@Builder` for builder pattern
  - `@AllArgsConstructor` for constructors with all fields
  - Avoid adding explicit getters/setters - let Lombok generate them
- **Records**: Use Java Records for immutable data classes (DTOs)
- **Naming Conventions**:
  - Package names: lowercase (e.g., `dev.lilcode.googlecard.v2.types`)
  - Class names: PascalCase
  - Enum values: UPPER_SNAKE_CASE
  - Variables: camelCase

### API Versioning
- The library supports both v1 (deprecated) and v2 of the Google Chat Cards API
- Mark v1 classes with `@Deprecated()` annotation
- Include javadoc comment: `@deprecated Use {@link dev.lilcode.googlecard.v2.types.ClassName} instead`

### Custom Annotations
Use these annotations to mark API-specific features:
- `@ChatExclusive` - Feature only available in Google Chat
- `@ChatApplicationExclusive` - Feature only available in Chat Applications
- `@WorkspaceExclusive` - Feature only available in Workspace
- `@Validate` - Class requires validation
- `@SingleFilledAttribute` - Only one attribute should be filled

### Data Types
- Use `ArrayList<T>` for lists instead of `List<T>`
- Use Java Records with `@Builder` for DTOs
- Keep records concise with minimal logic

## Dependencies
- **Retrofit 2.11.0**: HTTP client for REST API calls
- **Gson Converter 2.11.0**: JSON serialization/deserialization
- **Lombok 1.18.36**: Code generation (provided scope)
- **JUnit Jupiter**: Testing framework (RELEASE version - test scope)

## Build & Test
- **Build Tool**: Maven
- **Build Command**: `mvn clean compile`
- **Test Command**: `mvn test`
- **Package Command**: `mvn package`

### Maven Configuration
- Source encoding: UTF-8
- Java source/target: 23
- Packaging: JAR

## Testing Guidelines
- Place tests in `src/test/java` mirroring the main source structure
- Test class naming: `<ClassName>Test` or `<ClassName>ValidationTest`
- Use JUnit 5 (Jupiter) for all tests
- Focus on validation tests for classes marked with `@Validate`

## Documentation
- Add JavaDoc comments for public APIs
- Document deprecated classes and methods with `@deprecated` tag
- Include links to replacement classes/methods in deprecation notices
- Keep README.md updated with new features and progress on the to-do list

## Google Chat API Integration
- Follow Google Chat Cards API v1 specification: https://developers.google.com/workspace/chat/api/reference/rest/v1/cards
- Ensure DTOs match the Google API contract structure
- Handle both webhook and application integration patterns

## Common Patterns
1. **Nested Records**: Use nested records for complex structures (e.g., `Action.ActionParameter`)
2. **Enums**: Create enums for fixed value sets from the Google API
3. **Validation**: Implement validation logic in the `validations` package
4. **Annotations**: Use custom annotations to mark platform-specific features

## Best Practices
- Make minimal changes to achieve the goal
- Preserve existing working code
- Follow the existing code structure and patterns
- Use immutable data structures (Records) for thread safety
- Keep business logic separate from DTOs
- Validate inputs using the validation framework
- Write tests for new validation rules

## Future Directions
Current to-do items (do not implement unless explicitly requested):
- Implement with Google Chat Applications
- Implement a more intuitive way to add elements to the card
- Implement other Google APIs that use the same card system
