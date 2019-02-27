#include<stdio.h>
#include<string.h>

int main()
{
    char str[20];
    int hash1[130][130],hash2[130][130];
    int i;
    while(scanf("%s",str)!=EOF)
    {
        memset(hash1,0,sizeof(hash1));
        memset(hash2,0,sizeof(hash2));
        for(i=0;i<=2;i++)
        {
            hash1[str[i]][str[5-i]]++;
            hash1[str[5-i]][str[i]]++;
        }
        for(i=6;i<9;i++)
        {
             hash2[str[i]][str[17-i]]++;
             hash2[str[17-i]][str[i]]++;
        }
        for(i=0;i<=2;i++)
        {
            if(hash1[str[i]][str[5-i]]!=hash2[str[i]][str[5-i]]) break;
        }
        if(i==3) printf("TRUE\n");
        else printf("FALSE\n");
    }
    return 0;
}
