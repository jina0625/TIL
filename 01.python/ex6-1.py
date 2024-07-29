# 모듈
    # 연관있는 or 자주 사용하는 함수와 클래스 변수의 모음
    # 공통적으로 사용할 수 있는 코드
    # 기존에 사람들이 만들어 놓은 모듈을 사용하고, 없는 모듈은 직접 만들어 사용할 수 있음
    # 모듈은 ".py"파일로 저장
    # 모듈 사용하기
        # 모듈 사용 방법
            # import 모듈명
        # 모듈명이 길면 별명 붙일 수 있음
            # import 모듈명 as 별명
        # 다른 모듈에서 import할 경우
            # from 모듈 이름 import 모듈명, 변수명
        # 많은 모듈명과 함수명 모두 import 하는 경우
            # from turtle import *
            
# time 모듈
# import time
# input("엔터를 누르고 10초를 세보세요")
# start = time.time()
# input("10초 후 다시 엔터를 누릅니다.")
# end = time.time()
# print(f"실제로는 {end-start}초 입니다.")

print()

# 터틀 그래픽 메소드
    # forward(dist) : 향하고 있는 방향으로 특정거리 d만큼 이동 (=fd(dist) 픽셀단위)
    # backward(dist) : 향하고 있는 반대방향으로 특정거리 d만큼 이동 (=back(dist) 픽셀단위)
    # right(ang) : ang 각도 만큼 오른쪽으로 회전 (=rt(ang))
    # left(ang) : ang 각도 만큼 왼쪽으로 회전 (=lt(ang))
    # goto(x, y) : (x, y) 좌표로 이동
    # setx(x) : x좌표를 x위치로 이동
    # sety(y) : y좌표를 y위치로 이동
    # setheading(deg) : 거북이 머리를 deg각도로 방향 설정 (0:동, 90:북, 180:서, 270:남)
    # home() : 원점(0 ,0)으로 옮기고 동쪽방향(0°)으로 설정
    
    # pendown() : 펜 내림. 움질일 때 그려짐 (=pd())
    # penup() : 펜 올림. 움직일 때 그려지지 않음 (=pu())
    # pensize(d) : 선의 두께를 d로 설정
    # pencolor("c") : 펜 색상을 c로 설정 (알고 있는 대부분 컬러 (red, yellow, green..) 사용 가능)
    # showturtle() : turtle 모양 보이기
    # hideturtle() : turtle 모양 숨기기
    # shape("s") : 펜 모양 "s"로 설정 (arrow, turtle, circle, square, triangle, classic)
    
    # speed(s) : s 속도로 그리기 (0 <= s <= 10) (0 : 최고 빠름, 1 : 느림, 10 : 빠름)
    # circle(r, deg, steps) : 반지름 r, 경계 a도 만큼 그리기, steps 수 단계로 원 그리기 (a, steps 생략 가능, 꼭지점 개수)
    # dot(d, "color") : 지름 d, 색상 color로 원 그리기 (color 생략 가능)
    # fillcolor("c") : 펜 채우기 색상 c로 설정
    # begin_fill() : 도형 채우기 전에 이 메소드 호출
    # end_fill() : begin_fill()로 시작해서 채워지고 있는 도형을 end_fill() 호출 전까지 채움

print()

# 다각형 그리기
# import turtle as t
# import random
# t.setup(1000, 600)
# t.shape("turtle")
# t.shapesize(3)
# t.pensize(5)
# t.fillcolor("blue")
# t.pencolor("red")
# t.penup()
# t.goto(-400, 0)
# t.speed(1)
# t.pendown()

# for i in range(4) :
#     t.forward(100)
#     t.left(90)
# t.mainloop()

print()

# 다각형 그리기2
# import turtle as t
# import random

# t.setup(1000,600)
# t.shape('turtle')
# t.shapesize(3)
# t.pensize(5)
# t.fillcolor('green')
# t.pencolor('pink')
# t.penup()
# t.goto(-400, 0)
# t.speed(1)
# t.pendown()

# for i in range(4):
#     t.forward(100)
#     t.left(90)

# def drawShape(n) :
#     for i in range(n):
#         t.forward(100)
#         t.left(360/n)
# drawShape(10)
# drawShape(8)
# t.mainloop()

print()

# 별 그리기
# import turtle as t
# import random

# t.hideturtle()
# t.bgcolor("black")
# t.pencolor("yellow")
# t.pensize(2)
# t.speed(0)

# for i in range(30) :
#     t.penup()
#     x = random.randint(-350, 350)
#     y = random.randint(0, 350)
#     starsize = random.randint(10, 30)
#     t.goto(x, y)
#     t.pendown()
#     for j in range(5) :
#         t.forward(starsize)
#         t.right(144)

print()

# 색상 랜덤으로 바꾸기
# import turtle as t
# import random

# t.hideturtle()
# t.bgcolor("black")
# t.pencolor("yellow")
# t.pensize(2)
# t.speed(0)
# t.colormode(255)

# for i in range(30):
#     t.penup()
#     x = random.randint(-350,350)
#     y = random.randint(0, 350)
#     starsize = random.randint(10,30)
#     r = random.randint(0,255)
#     g = random.randint(0, 255)
#     b = random.randint(0, 255)
#     t.pencolor(r, g, b)
#     t.goto(x, y)
#     t.pendown()
#     for j in range(5):
#         t.forward(starsize)
#         t.right(144)
# t.mainloop()

print()

# 도형 반복
# import turtle as t
# import random
# t.shape("turtle")
# t.bgcolor("black")
# t.colormode(255)
# t.pensize(2)
# t.speed(0)
# n = 50

# (1) 정사각형 그리기
# for j in range(n) :
#     for i in range(4) :
#         t.forward(200)
#         t.left(90)
#     t.left(360/n)

# (2) 나선형 그리기
# for i in range(400) :
#     t.forward(i)
#     t.right(70)

# (3) 원 그리기
# for i in range(75) :
#     t.circle(i)
 
#     r = random.randint(0, 255)
#     g = random.randint(0, 255)
#     b = random.randint(0, 255)
#     t.pencolor(r, g, b)
# t.mainloop()

print()

# 미디어아트 그리기 (집)
# import turtle as t

# t.shape("turtle")
# t.pencolor("black")
# t.pensize(2)
# t.speed(0)

# house = int(input("집 크기를 입력하세요 : "))

# for i in range(3) :
#     t.forward(house)
#     t.left(120)
# t.right(90)
# for i in range(4) :
#     t.forward(house)
#     t.left(90)
# t.left(60)

# 함수로 변경
# def drawHouse(x, size, color) :
#     t.penup()
#     t.goto(x, 0)
#     t.pendown()
#     t.fillcolor(color)
#     t.begin_fill()
#     for i in range(3) :
#         t.forward(size)
#         t.left(120)
#     for i in range(4) :
#         t.forward(size)
#         t.right(90)
#     t.end_fill()
# drawHouse(-200, 100, "red")
# drawHouse(40, 200, "green")
# t.mainloop()

print()

# 구름 그리기
import turtle as t
import random

t.hideturtle()
t.pencolor("blue")
t.pensize(5)
t.speed(0)

t.fillcolor("blue")
t.begin_fill()
angle = 50
length = 100
t.circle(length, angle)
t.right(90)

angle = 100
length = 100
t.circle(length, angle)
t.right(45)

angle = 100
length = 50
t.circle(length, angle)
t.right(45)

angle = 150
length = 100
t.circle(length, angle)
t.right(90)

angle = 110
length = 120
t.circle(length, angle)
t.right(45)

angle = 110
length = 120
t.circle(length, angle)
t.right(10)

angle = 100
length = 110
t.circle(length, angle)
t.end_fill()
t.mainloop()