# Load necessary libraries
library(ggplot2)
library(dplyr)
library(readr)
library(maps)

# Load your generated data
social_data <- read_csv("social_data_1000.csv")

# 💡 Scatter Plot: Followers vs Likes
ggplot(social_data, aes(x = followers, y = likes, color = platform)) +
  geom_point(alpha = 0.6, size = 3) +
  theme_minimal() +
  labs(title = "Followers vs Likes by Platform",
       x = "Followers",
       y = "Likes")

# 📊 Bar Chart: Average Likes by Platform
social_data %>%
  group_by(platform) %>%
  summarize(avg_likes = mean(likes)) %>%
  ggplot(aes(x = platform, y = avg_likes, fill = platform)) +
  geom_bar(stat = "identity") +
  theme_minimal() +
  labs(title = "Average Likes per Platform",
       x = "Platform",
       y = "Average Likes")

