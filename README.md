# tilleggsstonader-version-catalog

Inneholder sentrale 3. parts biblioteker som brukes i Dagpenger applikasjoner i form av [gradle version catalog](https://docs.gradle.org/current/userguide/platforms.html).

## Oppdatering av versjoner

Automatisk

- Dependabot brukes for å oppdage nye versjoner av biblioteker. (merge dependabot PRs)

Manuelt
- Oppdater versjon i `gradle/libs.version.toml` og commit endringen.


Ny versjon [releases](https://github.com/navikt/tilleggsstonader-version-catalog/releases)

I Intellij kan man kjøre dette for å få oppdaterte versjoner lokalt
* `gradle generateCatalogAsToml`
* `Sync All Gradle Projects`

Det er ikke ønskelig å legge inn interne bibliotek, då det skaper sirkulære avhengigheter