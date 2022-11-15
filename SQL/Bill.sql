USE [petshop]
GO

/****** Object:  Table [dbo].[Bill]    Script Date: 15/11/2022 11:46:42 PM ******/
SET ANSI_NULLS ON
GO

SET QUOTED_IDENTIFIER ON
GO

CREATE TABLE [dbo].[Bill](
	[ID_Bill] [int] NOT NULL,
	[pId] [int] NULL,
	[pName] [nvarchar](50) NULL,
	[Species] [varchar](10) NULL,
	[Price] [decimal](18, 0) NULL,
	[Name] [nvarchar](50) NULL,
	[NumberPhone] [varchar](50) NULL,
	[Date] [varchar](50) NULL,
	[Status] [int] NULL,
	[Paid] [decimal](18, 0) NULL,
	[Retun] [decimal](18, 0) NULL,
 CONSTRAINT [PK_Bill] PRIMARY KEY CLUSTERED 
(
	[ID_Bill] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO

ALTER TABLE [dbo].[Bill] ADD  CONSTRAINT [df_Bill]  DEFAULT ((1)) FOR [Status]
GO

ALTER TABLE [dbo].[Bill] ADD  CONSTRAINT [DF_Bill_Paid]  DEFAULT ((0)) FOR [Paid]
GO

ALTER TABLE [dbo].[Bill] ADD  CONSTRAINT [DF_Bill_Retun]  DEFAULT ((0)) FOR [Retun]
GO

ALTER TABLE [dbo].[Bill]  WITH CHECK ADD  CONSTRAINT [FK_Bill_Buyer] FOREIGN KEY([NumberPhone])
REFERENCES [dbo].[Buyer] ([NumberPhone])
GO

ALTER TABLE [dbo].[Bill] CHECK CONSTRAINT [FK_Bill_Buyer]
GO

ALTER TABLE [dbo].[Bill]  WITH CHECK ADD  CONSTRAINT [FK_Bill_Pet] FOREIGN KEY([pId])
REFERENCES [dbo].[Pet] ([pId])
GO

ALTER TABLE [dbo].[Bill] CHECK CONSTRAINT [FK_Bill_Pet]
GO


