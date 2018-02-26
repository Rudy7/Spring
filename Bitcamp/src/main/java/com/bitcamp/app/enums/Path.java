package com.bitcamp.app.enums;

public enum Path {
	resources, js,img,css,
	RESOURCES{
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "/"+"resources"+"/";
		}
	},
	JS{
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "/"+"resources"+"/"+"js";
		}
	},
	IMG{
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "/"+"resources"+"/"+"png";
		}
	},
	CSS{
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "/"+"resources"+"/"+"css";
		}
	}
//	AUTH{
//		@Override
//		public String toString() {
//			// TODO Auto-generated method stub
//			return "auth";
//		}
//	},
//	/*VIEW("/WEB-INF/view/"),
//	SEPARATOR("/"),
//	EXTENSION(".jsp"),
//	DOT(".do");
//	public final String value;	
//	public String getValue() {
//		return value;
//	}*/
//	VIEW{
//		@Override
//		public String toString() {
//			// TODO Auto-generated method stub
//			return "/WEB-INF/view/";
//		}
//	},
//	SEPARATOR{
//		@Override
//		public String toString() {
//			// TODO Auto-generated method stub
//			return "/";
//		}
//	},
//	EXTENSION{
//		@Override
//		public String toString() {
//			// TODO Auto-generated method stub
//			return ".jsp";
//		}
//	},
//	DOT{
//		@Override
//		public String toString() {
//			// TODO Auto-generated method stub
//			return ".do";
//		}
//	};
}
