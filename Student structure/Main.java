#include<iostream>
using namespace std;
struct student
{
  int rn, grade;
  int marks[5];
  float avg;
};
int main()
{
  int n;
  cin >> n;
  struct student s[n];
  cout << "STUDENT MARKSHEET USING STRUCTURES" << endl;
  cout << "Enter the no of students" << endl;
  for(int i = 0; i < n; i++)
  {
    cin >> s[i].rn;
    cin >> s[i].marks[0] >> s[i].marks[1] >> s[i].marks[2] >> s[i].marks[3] >> s[i].marks[4];
  }
  cout << "rn s1 s2 s3 s4 s5 avg grade" << endl;
  for(int i = 0; i < n; i++)
  {
    s[i].avg = (s[i].marks[0] + s[i].marks[1] + s[i].marks[2] + s[i].marks[3] + s[i].marks[4]) / 5;
    if(s[i].avg > 70)
      s[i].grade = 1;
    else if(s[i].avg > 50 && s[i].avg < 70)
      s[i].grade = 2;
    else if(s[i].avg < 50)
      s[i].grade = 3;
    cout << s[i].rn << " " << s[i].marks[0] << " " << s[i].marks[1] << " " << s[i].marks[2] << " " << s[i].marks[3] << " " << s[i].marks[4] << " " << s[i].avg << " " << s[i].grade << endl;
  }
}