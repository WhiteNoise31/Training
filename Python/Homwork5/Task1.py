# Задача 30:  Заполните массив элементами арифметической прогрессии. Её первый элемент, разность и
# количество элементов нужно ввести с клавиатуры. Формула для получения n-го члена прогрессии: an = a1 + (n-1) * d.
# Каждое число вводится с новой строки.

numMin = int(input("Введите первый элемент --- "))
num = int(input("Введите разность"))
length1 = int(input("Введите длинну массива --- "))

list1 = [numMin + el * num for el in range(length1)]
print()
for el in list1:
    print(el)