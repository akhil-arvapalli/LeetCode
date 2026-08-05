class ATM:

    def __init__(self):
        self.values = [0]*5
        self.den = [20,50,100,200,500]
        

    def deposit(self, banknotesCount: List[int]) -> None:
         for i in range(len(banknotesCount)):
            self.values[i] +=banknotesCount[i]

    def withdraw(self, amount: int) -> List[int]:
        req = 0
        rmnamnt=amount
        temp = [0]*5
        for i in range(4,-1,-1):
            req = rmnamnt//self.den[i]
            if req>self.values[i]:
                rmnamnt-=self.values[i]*self.den[i]
                temp[i]+=self.values[i]
            else:
                rmnamnt-=self.den[i]*req
                temp[i]+=req
        if rmnamnt==0:
            for i in range(len(temp)):
                self.values[i]-=temp[i]
            return temp 
        else: return [-1]



        

        
        


# Your ATM object will be instantiated and called as such:
# obj = ATM()
# obj.deposit(banknotesCount)
# param_2 = obj.withdraw(amount)