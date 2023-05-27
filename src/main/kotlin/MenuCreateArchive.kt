// menu 1

class MenuCreateArchive : Menu() {

    override fun createMenu(currentChoice: CurrentChoice): MutableMap<Int, MenuItem> =

        getMenuForCreateElement(
            MenuItem("\nСОЗДАНИЕ АРХИВА\n") {},
            "архив",
            { name -> currentChoice.listArchives.add( Archive(name) ) },
            currentChoice,
            ListMenu.ARCHIVES
        )

}