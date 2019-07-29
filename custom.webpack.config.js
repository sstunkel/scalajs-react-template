var webpack = require('webpack');

module.exports = require('./scalajs.webpack.config');

// And then modify `module.exports` to extend the configuration

module.exports.module.rules.push({
  test: /\.css$/,
  use: [
    { loader: "style-loader" },
    { loader: "css-loader" }
  ]
});

module.exports.module.rules.push({
  test: /\.(woff(2)?|ttf|eot|svg)(\?v=\d+\.\d+\.\d+)?$/,
  use: [
    {
      loader: 'file-loader',
      options: {
        name: '[name].[ext]',
        outputPath: 'fonts/'
      }
    }
  ]
});