# print('출력할 문자열')
    # 표준 출력 하는 함수
    # 입력한 메세지나 값을 출력함
    # 작은 따옴표('')안의 내용을 화면에 출력
        # 큰 따옴표("") 사용해도 됨
        # 큰 따옴표(")와 작은 따옴표(') 혼용 불가
    # 콤마(,)로 숫자, 문자열 등 여러 개 연결 가능
print('hello world')
print('사과',2,'개')
print(1,2,3)
print(3+4+10)
print('1+2','=',1+2)


print()


# input()
    # 표준 입력 하는 함수
    # 입력 값은 항상 문자열로 받아옴
    # 괄효()안에 문자열 넣으면 프롬프트 역할 수행
n = input('당신의 이름은?')
print(n + '님 만나서 반갑습니다.')


print()


# 변수
    # 프로그램을 실행하는데 필요한 정보를 저장하는 메모리 공간
    # 변수이름 = 값(값을 변수에 할당함)
    # 숫자, 문자열 저장(문자열 지정 시 따옴표("or")로 구분)
    # 변수에 값 대입 시 변수가 선언되면 데이터 타입도 결정됨
    
    # 변수명 규칙
        # 대,소문자 구분
            # myVar와 MyVar는 다른 변수
        # 문자, 숫자, 언더바(_) 포함 가능
            # 숫자로 시작은 안됨
        # 공백 포함 불가
        # 예약어는 변수명으로 사용 불가
        # 한글 사용 가능
import keyword
print(keyword.kwlist)


print()


a = 5
b = 10
result = a+b
print('결과는',result,'입니다.')


print()


# 자료형
    # 프로그램에서 사용되는 값들의 형태
        # 기본 자료형
            # 숫자형 : 정수(integer) / 실수(float)
            # 문자열(string)
            # 부울형 : bool(true / false)
        # 복합 자료형
            # 리스트(list)
            # 튜플(tuple)
            # 딕셔너리(dictionary)
            # 집합(set)

    # type()
        # 함수 괄호 내에 자료를 넣으면 그 자료가 어떤 자료형을 가지고 있는지 확인 가능
a = 100
b = 3.14
print(a,b)
print(type(a),type(b))

    # 숫자형
        # 숫자 형태로 이뤄진 자료형
        # 연산 가능
        
        # 산술 연산자
            # 괄호 >> 곱셈, 나눗셈 >> 덧셈, 뺄셈
                # 사칙 연산자 : +,-,*,/
                # 몫 연산자 : //
                # 나머지 연산자 : %
                # 제곱 연산자 : **
                # 대입 연산자 : =
        # 할당 연산자
            # 변수에 값 대입 시 사용
            # 파이썬에서 증감 연산자(++,--)는 없음
            
    # 자료형 변환
        # 프로그램에서 특정 자료형을 다른 자료형으로 변환
a = 3
b = 4
print(a+b)
print(str(a) + str(b))
c = 3.14
print(int(c))


print()


    # 문자열형
        # 문자, 단어 등으로 구성된 문자들의 집합
        # 줄 바꿈 해야 할 경우
            # 큰 따옴표 3개(""" ~ """)
            # 작은 따옴표(''' ~ ''') 사용
            # \n
d = """안녕하세요
홍길동입니다.
만나서 반갑습니다."""
print(d)

print()

print("안녕하세요\n홍길동입니다.\n만나서 반갑습니다.")

print()

        # 문자열 연산
            # + : 두 문자를 하나로 연결
            # * : 문자열 반복
print("파이썬" + "시작하기")
print("안녕"*3)


print()


# 계산기 프로그램
a = input("첫번째 수를 입력하세요 : ")
b = input("두번째 수를 입력하세요 : ")
print(a," + ",b," = ", int(a) + int(b))
print(a," - ",b," = ", int(a) - int(b))
print(a," * ",b," = ", int(a) * int(b))
print(a," / ",b," = ", int(a) / int(b))