# Load data.table for efficient data handling
library(data.table)

# Read the dataset
data <- fread("C:/Users/M.Tech DS006/Documents/BDA003/products-1000.csv")

# View structure and summary
str(data)
summary(data)

# Basic statistics: Price and Stock
mean_price <- mean(data$Price, na.rm = TRUE)
sd_price <- sd(data$Price, na.rm = TRUE)

mean_stock <- mean(data$Stock, na.rm = TRUE)
sd_stock <- sd(data$Stock, na.rm = TRUE)

cat("Average Price:", mean_price, "\n")
cat("Price Std Dev:", sd_price, "\n")
cat("Average Stock:", mean_stock, "\n")
cat("Stock Std Dev:", sd_stock, "\n")

# Group-wise summary: Average price by category
category_summary <- data[, .(
  avg_price = mean(Price, na.rm = TRUE),
  avg_stock = mean(Stock, na.rm = TRUE),
  count = .N
), by = Category]

print(category_summary)

# Availability breakdown
availability_counts <- table(data$Availability)
print(availability_counts)

# Correlation between Price and Stock
correlation <- cor(data$Price, data$Stock, use = "complete.obs")
cat("Correlation between Price and Stock:", correlation, "\n")

