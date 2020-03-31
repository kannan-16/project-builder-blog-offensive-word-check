package utility;

import model.Blog;

abstract class OffensiveWordsChecker 
{
	String a[]= {"a55hole","acrotomophilia","aeolus","ahole","alabama hot pocket","	alaskan pipeline","anal","anal impaler","anal leakage","analprobe",
		      "anilingus","anus","apeshit","ar5e","areola", "areole","arian", "arrse", "arse"," arsehole"," aryan","ass", "ass fuck",
		      		 " ass fuck"," ass hole"};

	public boolean checkBlogTitle(Blog blog) 
	{
		String title=blog.getBlogTitle();
		for(int i=0;i<25;i++)
		{
			if(title.equalsIgnoreCase(a[i]))
			{
				System.out.println(a[i]);
				return true;
			}
		}
	
		return false;
	}
	
	public boolean checkBlogDescription(Blog blog)
	{
		String description=blog.getBlogDescription();
		for(int i=0;i<25;i++)
			{
			if(description.equalsIgnoreCase(a[i]))
				return true;
		}
	   return false;
	}
	
	public boolean checkBlog(Blog blog)
	{
		if((checkBlogTitle(blog))||(checkBlogDescription(blog)))
			return false;
		return true;
	}

}