void foo()
{
  char cIp[7] = {"abcdef"};
  cIp[7] = '\0';  // 배열 범위 초과
  printf("%s",cIp);
}