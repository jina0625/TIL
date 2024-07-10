# 반복문 (while)
    # 조건이 참인 동안 계속해서 반복함
    # 반복되는 문장 안에서 반복문 빠져나갈 수 있도록 조건 변경할 수 있는 문장 있어야 함
        # while 조건식 :
        #       수행할 문장1
        #       수행할 문장2 
    # 조건 상태에 따라 반복 (True), 반복 끝내기 (False)
    # 멈추기 : Ctrl + C
# while True :
#     print("Never ending story")
    
print()

while False :
    print("Never ending story")

# 변수 = 시작값
# while 변수 < 끝값 :
#       수행할 문장1
#       수행할 문장2
#       변수 = 변수 + 증가값

boolValue = True
cnt = 0

while boolValue :
    cnt = cnt + 1
    print(cnt)
    
    if cnt == 10 :
        boolValue = False
        
print()

i = 0
while i < 10 :
    print(f"{i}번째 반복입니다.")
    i = i + 1

print()

colors = ["red", "green", "blue", "black", "white"]
i = 0
while i < len(colors) :
    print(colors[i])
    i += 1
    
print()

# 1~10까지의 합을 구하고 출력하기
num = 0
sum = 0

while num < 10 :
    num += 1
    sum += num
    print(f"num = {num}, sum = {sum}")
    
print()

# 'q'를 입력할 때까지 반복하여 이름을 받는 프로그램 작성
name = 0

while name != "q" :
    name = input("이름을 입력하세요 : ")
    print(f"이름 : {name}")

print()

# 반복문 종료 조건
    # for문 : range()에 지정된 범위 벗어나면 반복 종료
    # while문 : 조건식이 False면 반복 종료
    # break : 반복 중에 break 만나면 바로 반복 종료
    
# 1부터 10까지 출력하기
num = 0

while num < 10 :
    num += 1
    print(f"{num}번째 출력합니다.")
    
print()

# break 사용해서 1부터 5까지만 출력하기
number = 1

while True :
    print(number)
    number += 1
    if number == 6 :
        break

print()

# continue
    # 뒤 문장 건너뛰고, 반복문 처음으로 돌아가서 계속 반복 수행
sum = 0

for i in range(1, 11, 1) :
    if i == 3 :
        continue
    
    print(f"{i}번 반복했습니다.")
    sum += i
    
print(f"합계 = {sum}")

print()

# 업 다운 프로그램
    # 1 ~ 50 사이의 정답 숫자를 랜덤으로 정하고, 사용자가 정해진 숫자를 맞추는 프로그램 작성
import random

ans = random.randint(1, 50)
print(ans)

while True :
    number = int(input("1 ~ 50 사이의 숫자를 입력하세요 : "))
    if ans > number :
        print("더 큰 수 입니다.")
    elif ans < number :
        print("더 작은 수 입니다.")
    else :
        print("정답입니다.")
        break