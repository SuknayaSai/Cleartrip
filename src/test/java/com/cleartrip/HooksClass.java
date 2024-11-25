package com.cleartrip;
import com.baseclass.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
public class HooksClass extends BaseClass {


		BaseClass base=new BaseClass();
		@Before
		public void browserSetup() {
			base.browserLaunch();
		}
		@After
		public void tearDown() {
			base.close();
		}

	}
