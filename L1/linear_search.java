// linear search

found = "no";
i=1;
while (found == "no" and i <= n)
{
    if (A[i] == x)
    {    
        found = "yes";
        location = i;
    }
    i++;
}
if (found == "no")
{
    print("Sorry, " + x + " is not on the list");
}
else
{
    print(x + 'occurs at position: ' + location);
}