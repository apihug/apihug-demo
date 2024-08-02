package config

import static hope.kola.contract.Configuration.*

var big = 1123

[
        common {
            baseURI("https://qa.example.com")
            port(9527)
            p("date", ofDate("2022-12-12"))
            rest {
                closeIdleConnectionsAfterEachResponse()
                log {
                    enablePrettyPrinting()
                    logAllDetailIfValidationFails()
                }
                client {
                    connectTimeoutInSeconds(3)
                }
            }

        },

        env("qa", {

            baseURI("https://qa.example.com")
            port(big)

        }),

        env("prod", {

            baseURI("https://prod.example.com")
            p("date", nowDayOfMonth())
            rest {
                closeIdleConnectionsAfterEachResponse(12l, second())
                log {
                    logAllDetailIfValidationFails()
                }
            }
        })
]
