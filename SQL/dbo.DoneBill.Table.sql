USE [petshop]
GO
/****** Object:  Table [dbo].[DoneBill]    Script Date: 16/11/2022 10:35:20 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[DoneBill](
	[Total] [decimal](18, 0) NULL,
	[Paid] [decimal](18, 0) NULL,
	[Retun] [decimal](18, 0) NULL,
	[ID_Bill] [int] NOT NULL,
 CONSTRAINT [PK_DoneBill] PRIMARY KEY CLUSTERED 
(
	[ID_Bill] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
