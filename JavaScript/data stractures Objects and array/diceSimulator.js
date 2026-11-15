//Roll a virtual dice 20 times using Math.random() Math.floor() Store every roll inside an array. Find how many times 6 appeared.
//Concepts
//Math object
//Arrays
//Loops
let store = [];
let count = 20;
for(let t=0;t < count;t++)
{
    dice = Math.floor(Math.random() * 10);
    if(dice >= 1 && dice <= 6)
	{
        console.log(dice);
        store[t] = dice;
    }
   else if(dice >= 7 && dice <= 9)
   {
        store[t] = dice - 4;
   }
   else if(dice == 0)
   {
        store[t] = 1;
   }
}
for(let i=0;i < count;i++)
{
   console.log(i+1+". "+store[i]);   
}
let counter = 0;
for(let c=1;c<=count;c++)
{
	if(store[c] == 6)
	{
		counter = counter + 1;
	}
}
console.log("counter of 6 saying there "+ counter + " time");
