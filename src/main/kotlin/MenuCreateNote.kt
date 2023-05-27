// menu 3

class MenuCreateNote: Menu() {

    override fun createMenu(currentChoice: CurrentChoice): MutableMap<Int, MenuItem> =

        getMenuForCreateElement(
            MenuItem("\nСОЗДАНИЕ ЗАМЕТКИ\n") {},
            "заметку",
            { name -> currentChoice.listArchives[currentChoice.currentArchive].notes.add( Note(name) ) },
            currentChoice,
            ListMenu.NOTES
        )
}

