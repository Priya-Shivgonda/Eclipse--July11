package com.xwork.overRiding;

	public class SupremeCourt extends Court {

		void importantCase() {
			System.out.println("Important case in Supreme court");

		}

		@Override
		void justice() {
			System.out.println("Justice in Supreme Court");
		}

	}
