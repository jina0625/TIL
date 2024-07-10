# while 이용해 리스트 내부에 있는 2를 모두 제거하는 프로그램
mylist = [1, 2, 3, 2, 4, 3, 5, 3, 6, 4, 2, 9]

while 2 in mylist :
    mylist.remove(2)
print(mylist)
    
print()

# 로그인 프로그램
while True :
    id = input("아이디를 입력하세요 : ")
    if id == "python" :
        print(f"{id}님 환영합니다.")
        break
    else :
        print("아이디를 찾을 수 없습니다. 다시 시도해주세요.")

print()

# 1부터 10까지 수 중 4의 배수만 제외한 나머지 총합 구하기
total = 0
num = 1

while num <= 10 :
    if num % 4 != 0 :
        total += num
    num += 1
    
print(f"4의 배수를 제외한 총합 : {total}")