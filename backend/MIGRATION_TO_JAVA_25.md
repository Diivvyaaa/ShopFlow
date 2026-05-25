Migration to Java 25

Summary
- Updated `java.version` property to 25 in `pom.xml`.
- Added `maven-compiler-plugin` 3.11.0 with `<release>25`.
- Updated `Dockerfile` to use Eclipse Temurin 25 base images.

Why
- Move project to latest LTS (Java 25) for security and support.

Notes
- Build tested with `mvn -DskipTests package` in the backend directory.
- If CI or deployment environments pin older JDKs, update them to Java 25.
- Verify production container images and orchestration tooling support Temurin 25.

Files changed
- `pom.xml`
- `Dockerfile`

If you'd like, I can also update CI workflows or create follow-up PR details.