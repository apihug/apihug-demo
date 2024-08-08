import hope.kola.contract.Feature

Feature.make {

    priority 100
    name("Customer login place order and check balance logic")
    description("""Never judge the boss, as you may the real fool""")
    //enable("qa", "dev")
    disable("prod")

    Scenario "let me test you", {
        Given {
            api("Demo001Service", "ExampleSayHello")
        }
        When {
            json """
            """
            body {
                set("user.name", "jake")
            }
        }
        Then {
            isOk()
        }
    }

    Scenario "baidu help me ", {
        Given {
            get("https://baidu.com")
        }
        Then {
            isOk()
        }
    }

}
