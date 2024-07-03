# 1부터 20까지 수 중 3 배수 빼고 출력
for i in range(1, 21) :
    if not i % 3 == 0 :
        print(i)

print()

# 1부터 100까지 수 총 합 구하기
sum = 0
for i in range(1, 101) :
    sum += i
    print(sum)

print()

# 1부터 100까지 수 중 짝수 총 합 구하기
sum1 = 0
for i in range(2, 101, 2) :
    sum1 += i
    print(sum1)
    
print()

# 점수 합계 구하기
score = [80, 95, 100, 70, 88]
total = 0
for i in range(0, 5) :
    total += score[i]
    print(f"총점은 {total}입니다.")

print()

# 3개의 정수를 입력 받아 합겨 구하여 출력하기
num1 = int(input("정수를 입력하세요 : "))
num2 = int(input("정수를 입력하세요 : "))
num3 = int(input("정수를 입력하세요 : "))
print(f"입력받은 정수의 합은 {num1 + num2 + num3}입니다.")

print()

# n개의 정수를 입력 받아 합계 구하여 출력하기
n = int(input("몇 개의 정수를 입력하시겠습니까? : "))
sum = 0
for i in range(n) :
    num = int(input(f"{i+1}번째 정수를 입력하세요 : "))
    sum += num
print(f"입력한 {n}개의 정수의 합계는 {sum}입니다.")
