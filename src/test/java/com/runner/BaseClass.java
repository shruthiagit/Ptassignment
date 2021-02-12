package com.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.Driver.Action;
import com.Driver.UserWait;
import com.Pages.PlaytechAgePage;
import com.Pages.SearchGooglePage;

public class BaseClass {

	public static WebDriver driver;
	public static SearchGooglePage searchGooglePage = new SearchGooglePage();
	public static Action action = new Action();
	public static UserWait userWait = new UserWait();
	public static PlaytechAgePage playtechAgePage = new PlaytechAgePage();

}
