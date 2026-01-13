# otel

Lightweight Spring Boot example that demonstrates OpenTelemetry observability (traces, metrics) and a local Grafana stack. Intended as a starter for instrumenting Spring Boot services and exploring telemetry with local development tooling.

Why this project is useful
- Minimal Spring Boot app preconfigured for OpenTelemetry
- Includes Docker Compose to run Grafana (grafana/otel-lgtm) for local visualization
- Shows how to build, run, and test with Maven and Spring Boot tooling

Quick start

Prerequisites
- Java 17+
- Maven 3.8+
- Docker & Docker Compose (for the Grafana stack)

Build and run locally
```bash
# build
mvn -DskipTests package

# run
java -jar target/*.jar

# or with the Spring Boot plugin
mvn spring-boot:run
```

Run with Docker Compose (local observability)
```bash
# starts Grafana (grafana/otel-lgtm) and any other services in compose.yaml
docker compose -f compose.yaml up
```

Verify
- App: http://localhost:8080 (or configured server.port)
- Health/metrics: http://localhost:8080/actuator/health and /actuator/metrics
- Grafana: http://localhost:3000 (see compose.yaml for credentials/data source)

OpenTelemetry configuration tips
- Use environment variables to point the app to an OTLP backend:
  - OTEL_EXPORTER_OTLP_ENDPOINT (e.g., http://localhost:4318)
  - OTEL_SERVICE_NAME (set a service name for traces)
- The project follows Spring Boot's observability conventions; see Spring Boot docs for actuator/observability.

Testing
```bash
mvn test
```

Useful links (local repository)
- Project help: ./HELP.md
- Docker Compose: ./compose.yaml

Where to get help
- Open an issue in this repository
- Check the project HELP.md file for quick pointers
- External docs:
  - Spring Boot Observability: https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html#actuator.observability
  - OpenTelemetry: https://opentelemetry.io

Contributing & maintainers
- Contributions welcome. Please read ./CONTRIBUTING.md if present, otherwise open an issue or submit a PR.
- Maintained by the project maintainers (see git history and pull request log).

License
- See the LICENSE file in this repository.

Notes
- This README is intentionally focused on developer onboarding. For in-depth docs and troubleshooting please use the repository docs or project wiki.