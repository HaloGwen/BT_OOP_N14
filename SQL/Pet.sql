USE [petshop]
GO

/****** Object:  Table [dbo].[Pet]    Script Date: 15/11/2022 11:47:41 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Pet](
	[pId] [int] NOT NULL,
	[pName] [nvarchar](50) NULL,
	[Price] [decimal](18, 0) NOT NULL,
	[Description] [nvarchar](500) NULL,
	[Species] [varchar](10) NOT NULL,
	[Status] [int] NULL,
 CONSTRAINT [PK_Pet_1] PRIMARY KEY CLUSTERED 
(
	[pId] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[Pet] ADD  CONSTRAINT [DF_Pet_Status]  DEFAULT ((1)) FOR [Status]
GO


