package com.simplilearn.emailValidation;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//String emailIDs[] = new String[10];
		String emailIDs[] = {"kartik@gmail.com", "kunal@gmail.com", "prajwal@gmail.com", "saurabh@gmail.com", "harshal@gmail.com", "mitesh@gmail.com", "saurabh.mali@gmail.com", "anurag@gmail.com", "abhishek@yahoo.com", "vishnu@gmail.com"};

		System.out.println("Please enter the email id to be searched : ");
		String emailIdToBeSearch = sc.nextLine();
		
		String reg = "^[a-zA-Z0-9.]+[@]{1}[a-zA-Z0-9]+[.]{1}[a-zA-Z]{2,3}";
		
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher(emailIdToBeSearch);
		
		if(matcher.matches())
		{
			int i;
			for(i = 0; i < emailIDs.length; i++)
			{
				if(emailIdToBeSearch.equals(emailIDs[i]))
				{
					System.out.println("Your email id is found.");
					break;
				}
			}
			if(i == emailIDs.length)
			{
				System.out.println("Your email id is not found.");
			}
		}
		else
		{
			System.out.println("Please enter valid email id.");
		}
	}

}
