void foo()
{
  int *p = (int *)malloc(sizeof(int)*4);
  p[1] = 3;
  free(p);
  p[1]=10;		// ������ �޸𸮸� ����Ѵ�.
}