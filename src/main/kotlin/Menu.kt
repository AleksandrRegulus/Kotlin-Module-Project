abstract class Menu() {

    abstract fun createMenu(
        currentChoice: CurrentChoice
    ): MutableMap<Int, MenuItem>
}

fun getMenuForCreateElement(
    header: MenuItem,
    typeObject: String,
    doAction: (String) -> Unit,
    currentChoice: CurrentChoice,
    listMenu: ListMenu
): MutableMap<Int, MenuItem> {

    val userInput = UserInput()
    val menuList: MutableMap<Int, MenuItem> = mutableMapOf()

    menuList[-1] = header
    menuList[0] = MenuItem("Ввести имя и создать $typeObject") {
        println("Введите имя:")
        doAction(userInput.getUserAnswerStringName())
        currentChoice.currentListMenu = listMenu
    }

    menuList[1] =
        MenuItem("Отмена. Вернуться в прерыдущее меню") { currentChoice.currentListMenu = listMenu }

    return menuList
}