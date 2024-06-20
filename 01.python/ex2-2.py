# if문
    # 참과 거짓을 판단하는 문장으로 조건 판단해 해당 조건에 맞는 문장 수행함
    # 조건은 불리언(boolean)표현식 사용해야 함
        # if 조건식 : 
        #       명령어1
        #       명령어2
        # 명령어3
    # 조건식이 참일 때 : 명령어1 -> 명령어2 -> 명령어3
    # 조건식 거짓 일때 : 명령어3

# 들여쓰기(indentation)
    # 파이썬에서는 괄호 대신 들여쓰기로 코드 묶어줌
    # 콜론(:) 사용 시 자동으로 들여쓰기 된 채로 다음 줄 시작됨
    # 들여쓰기 하지 않으면 문법 오류 발생
a = 10
if a < 14:
    print("14세 미만입니다.")

print()

score = 80
if score >=80:
    print("합격입니다.")

print()

# 정수 입력 받아 0보다 크면 "양수", 0보다 작으면 "음수" 출력
number = int(input("정수를 입력하시오 : "))
if number > 0 :
    print("양수입니다.")
print("음수입니다.")

print()

# 짝수와 홀수 구분 프로그램
num = int(input("정수 입력 : "))
if num % 2 == 0:
    print("짝수입니다.")
print("홀수입니다.")

print()

# if ~ else문
    # 기존 if문에 조건식이 거짓일 경우 수행할 문장을 실행하기 위한 else절 추가
        # if 조건식 :
        #       참일 때 수행1
        #       참일 때 수행2
        # else :
        #       거짓일 때 수행1
        #       거짓일 때 수행2
        
# 짝수와 홀수 구분 프로그램(if ~ else문)
num2 = int(input("정수 입력 : "))
if num2 % 2 == 0 :
    print("짝수입니다.")
else :
    print("홀수입니다.")
    
print()

# if ~ elif ~ else문
    # 기존 if문에 조건식이 거짓일 경우 수행할 문장을 실행하기 위한 elif절 추가
        # if 조건식1 :
        #       참일 때 수행1
        #       참일 때 수행2
        # elif 조건식2 :
        #       참일 때 수행3
        # elif 조건식3 :
        #       참일 때 수행4
        # else :
        #       모든 조건이 거짓일 때
        
# 정수 입력 받아 0보다 크면 "양수", 0보다 작으면 "음수" 출력
number2 = int(input("정수 입력 : "))
if number2 > 0 :
    print("양수입니다.")
elif number2 == 0 :
    print("0입니다.")
else :
    print("음수입니다.")

print()

# 날씨 출력 프로그램
weather = input("오늘의 날씨는? (맑음, 비, 눈) : ")
if weather == "맑음" :
    print("산책하기")
elif weather == "비" :
    print("우산 챙기기")
elif weather == "눈" :
    print("눈사람 만들기")
else :
    print("마음대로 하세요.")

print()

# 나이 입력 받아 국립 공원 입장권 발급 프로그램
age = int(input("나이를 입력하세요 : "))
if 8 <= age <= 18 :
    print("입장료는 1,000원입니다.")
elif 7 >= age or 65 <= age :
    print("입장료는 0원입니다.")
else :
    print("입장료는 3,000원입니다.")

print()

# 성적 관리 프로그램
grade = int(input("성적을 입력하세요 : "))
if grade >= 90 :
    print("A")
elif 80 <= grade < 90 :
    print("B")
elif 70 <= grade < 80 :
    print("C")
else :
    print("F")