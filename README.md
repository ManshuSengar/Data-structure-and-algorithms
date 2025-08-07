var isPalindrome=function(x){
if(x<0) return false;
  let xCOpy =x;
  let ans=0;
  while(x>0){
   let rem=Math.floor(x%10); 
   ans=(ans*10)+rem; 
   x=Math.floor(x/10);
  }
  return xCOpy ==ans;
};
