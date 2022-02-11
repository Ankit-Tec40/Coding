
n=-123456
import math
num=0
while(n > 0 or n < 0):
    num=num*10+int(math.fmod(n,10))
    n=int(n/10)            
print (num)