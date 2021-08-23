#include<iostream>
using namespace std;
void kmp_algo(string text, string pattern);
void compute_lps(string text, int text_len, string pattern, int pattern_len, int lps[]);
int main()
{
    string text, pattern;
    getline(cin, text);
    getline(cin, pattern);
    kmp_algo(text, pattern);
}
void kmp_algo(string text, string pattern)
{
    int text_len = text.length();
    int pattern_len = pattern.length();
    int lps[pattern_len];
    compute_lps(text, text_len, pattern, pattern_len, lps);
}
void compute_lps(string text, int text_len, string pattern, int pattern_len, int lps[])
{
    int len = 0, i = 1, j;
    lps[0] = 0;
    while(i < pattern_len)
    {
        if(pattern[i] == pattern[len])
        {
            len++;
            lps[i] = len;
            i++;
        }
        else
        {
            if(len != 0)
                lps[i] = lps[len-1];
            else
            {
                lps[i] = 0;
                i++;
            }
        }
    }
    i = 0, j = 0;
    while(i < text_len)
    {
        if(text[i] == pattern[j])
        {
            i++;
            j++;
        }
        if(j == pattern_len)
        {
            cout << "Found pattern at index " << i-j;
            j = lps[j-1];
        }
        else if(i < text_len && text[i] != pattern[j])
        {
            if(j != 0)
                j = lps[j-1];
            else
            i = i+1;
        }
    }
}