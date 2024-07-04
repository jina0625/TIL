# while True :
#     print("Never ending story")
    
# while False :
#     print("Never ending story")

# ---------------------------------------------------

# boolValue = True
# cnt = 0

# while boolValue :
#     cnt = cnt + 1
#     print(cnt)
    
#     if cnt == 10 :
#         boolValue = False

# -----------------------------------------------------

colors = ["red", "green", "blue", "black", "white"]
# i = 0
# while i < len(colors) :
#     print(colors[i])
#     i += 1
    
# for i in colors :
#     print(i)
    
# for i in range(len(colors)) :
#     print(colors[i])

# -------------------------------------------------------

# num = 0
# sum = 0

# while num < 10:
#     num += 1
#     sum += num
#     print(f"num = {num}, sum = {sum}")
    
# num = 1
# sum = 0

# while num < 11 :
#     sum = sum + num
#     print (f"num = {num}, sum = {sum}")
#     num = num + 1

# ---------------------------------------------------------
# name = 0

# while True :
#         name = input("이름을 입력하시오 : ")
#         print(f"이름 : {name}")
#         if name == "q" :
#             break

# name = ""
# while name != "q" :
#     name = input("이름 : ")

# name = ""
# myflag = True
# while myflag :
#     name = input("이름 : ")
#     if name == "q" :
#         myflag = False

# ------------------------------------------------------------
# boolValue = True
# i = 1
# while boolValue :
#     print(i)
#     i += 1
#     if i == 11 :
#         break
    
# continue : 반복문은 계속하되 해당 조건은 건너뜀

# -----------------------------------------------------------

# 업 다운 프로그램
import random 

ans = random.randint(1, 50)
print(ans)

while True :
    user = int(input("1 ~ 50 사이의 숫자를 입력하세요 : "))
    if ans > user :
        print("더 큰 수 입니다.")
    elif ans < user :
        print("더 작은 수 입니다.")
    else :
        print("정답입니다.")
        break
        




    
