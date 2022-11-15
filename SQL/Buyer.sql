USE [petshop]
GO

/****** Object:  Table [dbo].[Buyer]    Script Date: 15/11/2022 11:47:28 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Buyer](
	[Name] [nvarchar](50) NOT NULL,
	[NumberPhone] [varchar](50) NOT NULL,
	[Email] [varchar](50) NOT NULL,
	[Address] [nvarchar](500) NULL,
	[Gender] [varchar](20) NOT NULL,
 CONSTRAINT [PK_Buyer] PRIMARY KEY CLUSTERED 
(
	[NumberPhone] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO


