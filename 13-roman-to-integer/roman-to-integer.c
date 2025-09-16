int koikoi(char l)
{
    switch(l)
    {
        case 'I': return 1;
        case 'V': return 5;
        case 'X': return 10;
        case 'L': return 50;
        case 'C': return 100;
        case 'D': return 500;
        case 'M': return 1000;
        default: return 0;
    }
}

int romanToInt(char* s) 
{
    int i,result = 0;
    while(s[i])
    {
        int a = koikoi(s[i]);
        int b = koikoi(s[i+1]);
        if(a < b)
        {
            result -= a;
        }
        else
        {
            result += a;
        }
        i++;
    }
    return result;
}