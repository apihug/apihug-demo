import hope.kola.contract.Feature

Feature.make {

    priority 100
    name("My first test feature")
    description("""Always try to make it better""")
    enable("qa", "dev", "dev")
    disable("prod")


    Scenario "Make it better", {
        Given {
            api("com.apihug.sample.wire.api.demo001.VIPService", "GiveMePost")
        }
        When {
            json """
{	
  "name" : "Marquis Wolff"	
}
            """
            body {
                //set("example.name", "Another name")
            }
            multipart {
                file {
                    fromClasspath("hello.txt")
                }
                file {
                    url("https://example.com/file.test")
                    mimeType(applicationPdf())
                }

            }
        }
        Then {
            isOk()
        }
    }

}