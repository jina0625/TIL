# 반복문 (for)
    # 반복이 시작되기 전 반복할 횟수 정함
    # 정해진 횟수만큼 반복함 (반복 횟수 알 때 사용)
    # 조건이 참인 동안 계속해서 반복함
        # for 반복용변수 in 시퀀스데이터 :
        #       code 
            # 시퀀스데이터 : 순서가 있는 데이터
            #               ex) 문자열, 리스트, 튜플 등
for i in "python" :
    print(i)
    
print()

arr = ["apple", "banana", "mango", "melon"]
for i in arr :
    print(i)
    
print()

# range()
    # 일정한 범위 정수들을 한번에 생성함 (규칙, 순서 존재)
        # range(from_value, end_value, step)
            # from_value : 시작값 (default = 0), 생략가능
            # end_value : 종료값, 생략 불가능
            # step : 증가값 (default = 1), 생략가능
    # from_value부터 end_value -1 사이 모든 정수를 갖는 수열 객체 생성
for i in range(5) :
    print(i)
    
print()

for i in range(1, 6, 2) :
    print(i)

print()

print(list(range(10)))
print(list(range(3, 10)))
print(list(range(3, 10, 2)))

print()

for i in range(5) :
    print("Hello")
    print("Python")
print("Bye")

print()

# 1부터 10까지 출력
for i in range(1, 11) :
    print(i)
    
print()

# 1부터 10까지 수 중 짝수만 출력
for i in range(2, 11, 2) :
    print(i)
 
print()

# 1부터 10 더해서 출력
sum = 0
for i in range(1, 11) :
    sum = sum + i
    print(sum)

print()

data = [273, "apple", list(range(3)), 3.14, "홍길동"]
for i in range(5) :
    print(data[1])

print()

# 중첩 반복문
# 5단 출력하기
dan = 5
for i in range(1, 10) :
    print(f"{dan} x {i} = {dan * i}")
    
print()

# 단 입력받아 출력하기
dan2 = int(input("몇 단을 출력할까요? : "))
for i in range(1, 10) :
    print (f"{dan2} x {i} = {dan2 * i}")

print()

# 2단부터 9단까지 모두 출력하기
for i in range(2, 10) :
    print("=" * 5, i, "단", "=" * 56)
    for j in range(1, 10) :
        print(f"{i} x {j} = {i * j}")