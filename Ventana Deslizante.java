/*
Daniel Felipe Camargo Roa - 20172020078
Juan Andres Guerra Origua - 20181020003
Juan Sebastian Moreno Bocanegra - 20152020097


*/

import java.util.Arrays;

public class PasarJava
{

	public static final int INF = 0x3f3f3f3f;
	public static final int maxn = 100000 + 10;
	public static int s;
	public static int n;
	public static int T;
	public static Int[] p = new Int[maxn];
	public static Int[] c = new Int[maxn];
	public static boolean[] flag = new boolean[maxn];

	public static void init()
	{
//El equivalente de en C++ sizeof en java seria getNativeSize(atribute)

//El equivalente de en C++ funcion 'memset' en java seria Array.fill()

 		Array.fill(flag, 0, getNativeSize(flag)); /
		Array.fill(c, 0, getNativeSize(c));

		int re = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			s = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p[i] = tempVar3;
			}
			if (i < s)
			{
				if (c[p[i]])
				{
					re++;
				}
				c[p[i]]++;
			}
		}

		for (int i = 0;i < n;i++)
		{
			if (re == 0)
			{
				flag[i] = true;
			}

			if (c[p[i]] == 2)
			{
				re--;
			}
			c[p[i]]--;

					 Int k = i + s; 
			if (k >= n)
				continue;
			if (c[p[k]])
			{
				re++;
			}
			c[p[k]]++;
		}
	}

	public static boolean judge(int x)
	{
		for (int i = x;i < n;i += s)
		{
			if (!flag[i])
			{
				return false;
			}
		}
		return true;
	}

	public static int solve()
	{
		int ans = 0;

			 Array.fill(c,0,getNativeSize(c)); 
		for (int i = 0;i < s;i++)
		{
			if (judge(i))
			{
				ans++;
			}
			if (i >= n)
				continue;
					 If(c[p[i]]) break;
			c[p[i]]++;
		}
		return ans;
	}

	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			T = Integer.parseInt(tempVar);
		}
		while (T-- != 0)
		{
			init();
			System.out.printf("%d\n",solve());
		}
	}
}




