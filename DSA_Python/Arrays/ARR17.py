# Best time to buy and Sell stock  Type I: At most one transaction is allowed
def maxProfit1(arr):
    maxProfit=0
    min=arr[0]
    for i in range(1,len(arr)):
        if arr[i]<min:
            min=arr[i]
        profit=arr[i]-min
        if profit>maxProfit:
            maxProfit=profit
    return maxProfit

# 122. Best Time to Buy and Sell Stock II - multiple transition allowed
    # def maxProfit2(arr):
    #     maxProfit=0
    #     min=arr[0]


        

    


arr1 = [7,8,5,3,6,4,2]
print(maxProfit1(arr1))


arr2=[7, 1, 5, 3, 6, 4]