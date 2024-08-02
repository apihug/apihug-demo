import hope.kola.contract.Feature

Feature.make {

    priority 1000
    name("just a tester")
    description("""Let it go""")

    Scenario "gk help me ", {
        Given {
            get("https://www.gongkongmall.com/")
        }
        And {
            isOk()
        }
        postScript {
            add {
                addStatement("""System.out.println("Who are you?")""")
            }
        }
    }

}
