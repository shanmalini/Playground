#include<iostream>
using namespace std;
void naive_algo(string text, string pattern)
{
    int text_len = text.length();
    int pattern_len = pattern.length();
    int i, j;
    for(i = 0; i < text_len; i++)
    {
        for(j = 0; j < pattern_len; j++)
        {
            if(text[i+j] != pattern[j])
                break;
        }
        if(j == pattern_len)
            cout << "Pattern found at index " << i;
    }
}
int main()
{
    string text, pattern;
    getline(cin, text);
    getline(cin, pattern);
    naive_algo(text, pattern);
}