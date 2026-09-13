fun main() {
    while (true) {
        println("Введите выражение в следующем формате: ")
        println("число1 число2 операция")
        val inp = readln()
        val inparray = inp.split(" ")
        if (inparray.size != 3) {
            println("Ошибка! Неверный формат!")
            continue
        }
        val a = inparray[0].toDoubleOrNull()
        val b = inparray[1].toDoubleOrNull()
        val oper = inparray[2]
        if (a == null || b == null)
        {
            println("Ошибка! Неизвестные символы!")
            continue
        }
        if (oper != "+" && oper != "-" && oper != "*" && oper != "/")
        {
            println("Ошибка!" +
                    "В качестве операции доступны только: +, -, *, /")
            continue
        }
        if (oper == "/" && b == 0.0)
        {
            println("Ошибка! Нельзя делить на ноль!")
            continue
        }
        val res = when (oper)
        {
            "+" -> a + b
            "-" -> a - b
            "*" -> a * b
            "/" -> a / b
            else -> "???"
        }
        println("Результат выражения: $res")
        break
    }
}