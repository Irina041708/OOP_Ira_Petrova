# Задайте список из N элементов,
# заполненных числами из промежутка [-N, N].
# Найдите произведение элементов на указанных позициях.
# Позиции хранятся в файле file.txt в одной строке одно число.
from math import factorial
from turtle import begin_fill
user_number = int(input("Введите целое число больше нуля: "))
list_user_number = []
key_list = []
for i in range(-1*user_number, user_number+1):
    list_user_number.append(int(i))
print(list_user_number)
result = 1
date = open('DZ2//file.txt', 'r')
for line in date:
    result = list_user_number[int(line.strip())] * \
        list_user_number[int(line.strip())]
date.close()
print(
    f'На считываемой из файла позиции {line} произведение элементов равно {result}')
