void foo()
{
  char cIp[7] = {"abcdef"};
  cIp[7] = '\0';  // �迭 ���� �ʰ�
  printf("%s",cIp);
}