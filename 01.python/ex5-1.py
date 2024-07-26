#  함수 (function)
    # 어떤 일을 실행하기 위한 코드 집합
    # 함께 사용하는 여러 개의 문장 (statement) or 명령어를 하나로 묶어 놓은 것
    # 주어진 입력에 대해 어떤 과정 거쳐 출력으로 내보내는 박스
     # 함수의 필요성
        # 동일한 처리 코드 재활용
        # 자원 효율적 관리
        # 가독성 향상
        # 프로그램 흐름 파악 & 디버깅 용이
        # 유지 보수 용이
result = len("안녕하세요")
print(result)


print()

# 내장함수
    # 파이썬 프로그램에 기본적으로 내장된 함수
    # import 불필요
    # print(), input()
    
    # abs(x)
        # 절대값 구할 때 abs라는 이름 함수 사용
        # 매개변수로 넣은 숫자가 변하는 것이 아닌, 넣은 숫자는 가만히 있고 넣은 숫자의 절대값이 반환되는 것 
print(abs(-3))

print()

    # divmod()
        # 두 개의 숫자를 인자로 받아, 첫번 재 숫자를 두번 째 숫자로 나눈 몫과 나머지를 튜플 (tuple) 형태로 반환
print(divmod(11, 3))

print()

def even(arr) :
    result = []
    for i in arr :
        if i % 2 == 0 :
            result.append(i)
    return result
    
print(even([1, 2, 3, 4, 5, 6, 7]))
 
print()

# 외장 함수
    # 내장함수가 아닌 모듈 / 패키지 함수
    # import 사용 (import 모듈 이름)
    # 모듈 이름 뒤 점(.) 찍고 사용
    # random.randint()
    # 전 세계 사용자들이 만든 유용한 프로그램 모음
    # "파이썬 라이브러리"
        
import random
print(random.random())
print(random.randrange(1, 7))
abc = ["a", "b", "c", "d", "e"]

# random.choice()
    # 지정된 sequence(리스트 등) 내 범주에서 무작위로 1개 선택하여 추출
print(random.choice(abc))
print(abc)

# random.shuffle()
    # 리스트와 같은 객체의 원소들을 무작위로 셔플하여 섞어 주는 함수
    #  각 원소들의 인덱스를 무작위로 변경해 주는 것
random.shuffle(abc)
print(abc)

print()

# random 활용 예제 만들기
# 저녁 메뉴 추천
dinner = ["햄버거", "치킨", "라멘", "피자", "떡볶이", "카레"]
print(f"저녁메뉴는 {random.choice(dinner)}입니다.")
    
print()

# 사용자 정의 함수
    # 인수 arguments : 호출하는 프로그램에 의해 실제로 함수에 전달되는 값
    #  매개변수 parameter : 인수 값을 전달받는 변수
    #  반환값 return value : 호출한 곳을 반환하는 실행 결과 값
        # 함수 정의부
            # def 함수이름 (매개변수1, 매개변수2, ... ) :
            # return 반환값
        # 함수 호출부
            # 함수 이름 (전달인자1, 전달인자2, ...)
def greet(name, msg) :
    print("안녕", name, msg)
greet("홍길동", "잘 지내니?")

print()

# 디폴트 인수
def greet2(name, msg="별 일 없지?") :
    print("안녕", name, msg)
greet2("홍길동")

print()

# 키워드 인수
def greet3(name, msg) :
    print("안녕", name, msg)
greet3(msg="별일없지?", name="홍길동")

print()

# 여러 개 결과 반환
def sub() :
    return 1, 2, 3

a, b, c = sub()
print(a, b, c)

print()

# 사용자 정의 함수로 변경하기
# 1부터 ?까지 합을 구해 출력하기
end = int(input("몇까지 합을 구할까요 : "))
sum = 0
for i in range(1, end+1) :
    sum += i
print(f"1부터 {end}까지 합은 {sum}입니다.")

print()

# 사용자 정의 함수로 변경하기
def getSum(start, end) :
    print (f"1부터 {end}까지 합은 {sum}입니다.")
getSum(1, 10)

print()

# 함수와 변수
width = 10
height = 20

def area(w, h) :
    result = w*h
    return result
print(area(width, height))

print()

    # 지역 변수 (local variable) : 함수 안에서 선언한 변수
s = "사과가 좋아"
def sub() :
    s = "바나나가 좋아"
    print(s)
sub()
print(s)

print()

    # 전역 변수 (global variable) : 함수 외부에서 선언한 변수
s = "사과가 좋아"
def sub() :
    global s
    print(s)
    s = "바나나가 좋아"
    print(s)
sub()
print(s)

print()

import ex5 as e
e.mySum(5)