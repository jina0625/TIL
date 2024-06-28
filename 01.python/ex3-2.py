# 복합 자료형
    # 하나의 변수에 다수의 데이터를 저장하는 자료형
        # 리스트 (list)
        # 튜플 (tuple)
        # 딕셔너리 (dictionary)
        # 집합 (set)
        

# 리스트 (list) 형
    # 여러 개의 데이터 값을 하나의 변수에 담을 수 있는 데이터 구조
    # 대괄호 [] 사용해 여러 데이터 저장할 수 있는 자료형
        # 리스트명 = [요소, 요소, 요소, ...]
    # 인덱싱, 슬라이싱 이용 가능
    # 데이터 추가, 수정, 삭제 가능 -> 리스트는 변할 수 있음 (mutable)
color = ["red", "green", "blue", "black", "white"]
print(color[0])
print(color[4])
print(color[1:4])
print(color[-1])

print()

flowers = ["무궁화", "장미", 30, "개나리"]
flowers[2] = "진달래"
print(flowers)

print()

foods = ["라면", "빵", 700]
foods[2] = "떡볶이"
print(foods)

print()

print(flowers + foods)
print(flowers * 3)

print()

# 리스트 메소드
    # append (x) : 데이터 x를 리스트 끝에 추가
    # clear() : 리스트를 비움
    # copy() : 리스트 복제
    # count() : 데이터 x 개수를 알아냄
    # extend (M) : 리스트 M을 연결
    # index (x) : 데이터 x의 위치를 알아냄 (인덱스를 알려줌)
    # insert (i,x) : 데이터 x를 지정한 위치 (인덱스 i)에 삽입
    # pop() : 리스트 지정한 값 하나를 읽어 내고 삭제
    # remove (x) : 리스트에서 데이터 x를 삭제
    # sort() : 리스트 정렬

# 요소 추가하기
flowers.append("튤립")
print(flowers)

print()

foods.insert(1, "아이스크림")
print(foods)
  
print()

# 리스트 조작하기
rappers = ["김하온", "자이언티", "기리보이", "팔로알토"]
print(rappers)
# 맨 뒤에 박재범 추가하기
rappers.append("박재범")
print(rappers)
# 자이언티 뒤에 사이먼도미닉 추가하기
rappers.insert(2, "사이먼도미닉")
print(rappers)
# 비와이, 제시 한번에 추가하기
rappers.extend(["비와이", "제시"])
print(rappers)
# 팔로알토 제거하기
rappers.remove("팔로알토")
print(rappers)
# rappers 모두 제거하기
rappers.clear()
print(rappers)

print()

# 튜플 (tuple) 형
    # 소괄호 ()로 생성하거나 생략도 가능
        # 튜플변수명 = (데이터, 데이터, 데이터, ...)
        # 튜플변수명 = 데이터, 데이터, 데이터, ...
    # 함수 리턴에 많이 사용 (여러 개의 값 리턴 가능)
    # 튜플 만들기 위해 각 요소 사이 ,(쉼표) 넣음
    # 연산자 +, * 와 인덱싱, 슬라이싱 가능
    # 삭제하거나 바꿀 수 없음
T = (1, 3, 5, 7, 9)
T2 = 1, 3, 5, 7, 9
print(type(T))
print(type(T2))

print()

# 튜플 사용 이유
    # 더 적은 메모리 공간 사용
    # 읽기 전용이므로 데이터가 실수로 손상될 염려 없음
    # 바뀌면 안되는 민감한 데이터일 때 사용 ex) 주민등록번호
    # 튜플을 딕셔너리 키로 사용 가능
    # 리스트보다 간단한 구조라서 성능 빠름

# 12간지 출력하기
tti = ("원숭이", "닭", "개", "돼지", "쥐", "소", "범", "토끼", "용", "뱀", "말", "양")
year = int(input("태어난 해를 입력하세요 : "))
num = year % 12
print(f"{tti[num]}띠 입니다.")