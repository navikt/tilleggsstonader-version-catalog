import java.net.URI

plugins {
    `version-catalog`
    `maven-publish`
}

group = "no.nav.tilleggsstonader"

catalog {
    versionCatalog {
        from(files("./gradle/libs.versions.toml"))
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["versionCatalog"])
        }
    }
    repositories {
        maven {
            name = "GitHubPackages"
            url = URI("https://maven.pkg.github.com/navikt/tilleggsstonader-version-catalog")
            credentials {
                username = "x-access-token"
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}
